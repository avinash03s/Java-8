package threads;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class DeadLockDetect {

    public static void main(String[] args) {

        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        long[] ids = bean.findMonitorDeadlockedThreads();
        if(ids != null)
        {
            ThreadInfo[] threadInfo = bean.getThreadInfo(ids);

            for (ThreadInfo threadInfo1 : threadInfo)
            {
                System.out.println(threadInfo1.getThreadId());    //Prints the ID of deadlocked thread

                System.out.println(threadInfo1.getThreadName());  //Prints the name of deadlocked thread

                System.out.println(threadInfo1.getLockName());    //Prints the string representation of an object for which thread has entered into deadlock.

                System.out.println(threadInfo1.getLockOwnerId());  //Prints the ID of thread which currently owns the object lock

                System.out.println(threadInfo1.getLockOwnerName());  //Prints name of the thread which currently owns the object lock.
            }
        }
    }
}
