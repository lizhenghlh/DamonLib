package tk.zhenglee.comzhengleeframework.schedule;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhenglee on 15/10/21.
 */
public class AsyncTaskQueue {

    private static ThreadFactory THREAD_FACTORY = new ThreadFactory() {

        private final AtomicInteger count = new AtomicInteger();

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "AsyncTask #" + this.count.getAndIncrement());
        }
    };

}
