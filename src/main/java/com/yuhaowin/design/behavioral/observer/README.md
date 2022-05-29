观察者模式:

定义:定义了对象之间的一对多的依赖,让多个观察者对象同时监听某一个主题对象,当主题对象发生变化时,
它的依赖者(观察者)都会收到通知并进行更新.


类型:行为型

适用的场景:

关联行为的场景,建立一套触发机制


优点:

观察者和被观察者,建立一个抽象的耦合,容易扩展, 观察者模式支持广播通信,

缺点:
观察者之间有过多的细节依赖,提高了时间的消耗,和程序的复杂度.

使用要得当,避免循环调用.


观察者模式，涉及两个对象，Observable 和 Observer， 1 对 N 的关系，Observable 发生变化调用 update 通知到多个 Observer

监听器模式，和观察者类似，涉及三个对象，EventSource、Event、Listener，Listener 等同与 Observer，EventSource 帮助建立 Event 和 Listener 联系
EventSource 持有多个 Listener，把 Event 推送给多个 Listener。