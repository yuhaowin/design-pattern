策略模板

定义:定义了一个算法家族,分别的封装起来,让他们之间可以相互的替换,此模式让算法的变化不会影响到使用算法的用户

类型:行为型;

田忌赛马  促销策略

可以消除大量的if - else

策略模式的适用场景: 系统中有很多的类,而他们的区别,仅仅在于他们的行为不同,系统需要动态的在几个算法(策略)中选择一种

优点: 开闭原则
      避免了适用大量的条件转移语句  if - else  switch case 等 
      
      提高算法的保密性和安全性;
      
缺点: 客户端必须知道所有的策略类,并自行决定选择其中的一个策略类
     会产生很多的策略类;
     
相关设计模式:
策略模式和工厂模式
策略模式和状态模式
           
           
源码:
      Comparator
      
      TreeMap
      
      Spring -> InstantiationStrategy