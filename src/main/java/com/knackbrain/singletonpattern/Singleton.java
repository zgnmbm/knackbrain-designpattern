package com.knackbrain.singletonpattern;

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
    }

    //  With this approach there can be concurrency problem before the
    //  object is initialized in the first time. Such as two thread checking
    //  to see that the uniqueInstance is null and they will both initialize it.
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    /**
     * Solving the the above problem can be in three ways.
     */
    //  1:
    //  Synchronizing the getInstance method.
    //  The problem with this approach is that, because the method is
    //  synchronized, the method cannot be accessed concurrently anymore,
    //  which will then turn this method into single threaded method, before
    //  a thread can access it, if another thread has acquired the lock, the
    //  the second thread has to wait.
    public static synchronized Singleton getInstanceUsingSynchronizationV1() {

        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    //  Same as above, only with minimal/granular synchronization.
    public static Singleton getInstanceUsingSynchronizationV2() {

        synchronized (Singleton.class) {
            if (uniqueInstance == null) {
                uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }

    //  2:
    //  The second way to solve the problem is by eagerly instantiating the
    //  singleton object. In this approach the JVM guarantee that the instance
    //  will be instantiated before the any thread access the method for getting
    //  the instance.
    //  With this approach, instead of initializing the object as above E.g.
    //  <code>
    //      private static Singleton uniqueInstance;
    //  </code>
    //  you will instead do it as shown below.
    //  <code>
    //      private static Singleton uniqueInstance = new Singleton();
    //  </code>
    //
    //  COMMENTED BECAUSE THE ABOVE INITIALIZATION IS NOT ACCORDING TO
    //  THIS APPROACH.
    //  <code>
    //      public static Singleton getEagerlyCreatedInstance() {
                //  And here you will just return the instance because
                //  you are sure the instance has already been created
                //  any thread could access it.
    //          return uniqueInstance;
    //      }
    //  </code>

    //  3:
    //  With approach 1, anytime a thread want to access the method it has to
    //  acquire a lock, which is not necessary, only adding overhead.  To make
    //  smooth we can in this approach we use double-check locking to ensure
    //  the thread safety of the method and we also change to volatile so that
    //  changes can reflect immediately. E.g. Variable declaration.
    //  <code>
    //      private volatile static Singleton uniqueInstance;
    //  </code>
    //  COMMENTED BECAUSE THE ABOVE INITIALIZATION IS NOT ACCORDING TO
    //  THIS APPROACH.
    //  <code>
    //      public static Singleton getInstanceUsingDoubleCheckMethod() {
    //          if (uniqueInstance == null) {
    //              synchronized (Singleton.class) {
    //                  if (uniqueInstance == null) {
    //                      uniqueInstance = new Singleton();
    //                  }
    //              }
    //          }
    //          return uniqueInstance;
    //      }
    //  </code>

}
