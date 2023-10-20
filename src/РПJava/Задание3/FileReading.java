package РПJava.Задание3;import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.Semaphore;

public class FileReading {
    public static void main(String[] args) {
        // Создаем семафоры для синхронизации потоков
        Semaphore semaphore1 = new Semaphore(1);
        Semaphore semaphore2 = new Semaphore(0);

        // Задаем имя файла для чтения
        String fileName = "E:\\Dubna State Univeristy\\7й семестр\\РП Java Дидоренко\\DevOpsOnJava\\src\\РПJava\\Задание3\\file.txt";

        // Создаем первый поток для чтения файла
        Thread thread1 = new Thread(new FileReadingThread(fileName, semaphore1, semaphore2, true));
        // Создаем второй поток для чтения файла
        Thread thread2 = new Thread(new FileReadingThread(fileName, semaphore2, semaphore1, false));

        // Запускаем оба потока
        thread1.start();
        thread2.start();
    }

    static class FileReadingThread implements Runnable {
        private final String fileName;
        private final Semaphore currentSemaphore;
        private final Semaphore nextSemaphore;
        private final boolean isOddThread;

        public FileReadingThread(String fileName, Semaphore currentSemaphore, Semaphore nextSemaphore, boolean isOddThread) {
            this.fileName = fileName;
            this.currentSemaphore = currentSemaphore;
            this.nextSemaphore = nextSemaphore;
            this.isOddThread = isOddThread;
        }

        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                int lineNumber = 1;

                while ((line = reader.readLine()) != null) {
                    // Ожидаем разрешение от предыдущего потока
                    currentSemaphore.acquire();

                    // Проверяем, является ли строка нечетной или четной
                    if ((lineNumber % 2 == 1 && isOddThread) || (lineNumber % 2 == 0 && !isOddThread)) {
                        // Показываем работу текущего потока и прочитанную строку
                        System.out.println("Thread " + Thread.currentThread().threadId()+ ": " + line);
                    }

                    lineNumber++;

                    // Освобождаем разрешение для следующего потока
                    nextSemaphore.release();
                }

                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
