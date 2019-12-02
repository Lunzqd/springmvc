### Spring boot 知识分享

> springboot官网：<https://spring.io/projects/spring-boot/>
>
> springboot技术栈：<https://www.processon.com/mindmap/5dc1358ce4b0e433945ca671>

springboot 和 react 实现MVC模式

#### 一、简单了解一下微服务架构：

![spring-boot微服务架构图](./pic/spring-boot微服务架构图.png)

#### 二、了解MVC单体架构项目：

![MVC简单结构](./pic/MVC简单结构.jpg)



MVC本身不属于设计模式的一种，它描述的是一种结构，最终目的达到解耦，解耦说的意思是你更改某一层代码，不会影响我其他层代码。像spring这样的框架，你会了解面向接口编程，表示层调用控制层，控制层调用业务层，业务层调用数据访问层。第一课简单了解一下这个模式，后续会慢慢展开去学习分享。从最原始的不用框架到`SSM`框架，再到`spring-boot`。

##### 1.domain

- `PO`即`persistant Object` 持久对象：
  在`O/R` 映射（即`ORM-ObjectRelationMapping`）中出现的概念，通常对应数据模型（数据库），是与数据库汇总的表想影射的java对象，最简单的`PO`就是对应数据库中某个表中的一条记录，多个记录则用`PO`的集合。`PO`中不应该包含任何对数据库的操作。

- `DO`即`Domain Object` 领域对象：
  是从现实世界中抽象出来的有形或无形的业务实体。

- `TO`即`Transfer Object`数据传输对象：
  不同应用程序之间传输的对象

- `DTO`即`Data Transfer Object`:数据传输对象：
  泛指用于展示层与服务层之间的数据传输对象

- `VO`即`value Object`：
  通常用于业务层之间的数据传递，和`PO`一样仅包含数据，但是抽象出的业务对象，可以和表对应，用`new` 关键字创建，`GC`回收

- `BO`即`Business Object` 业务对象:
  主要是将业务逻辑封装为一个对象，这个对象可以包含一个或多个其他对象，如一个简历中包含教育经历、工作经历、社会关系等，可以将一个教育经历对应一个`PO`、工作经历对应一个`PO`、设计关系对应一个`PO`，然后简历一个对应简历的`BO`兑现处理简历，每个`BO`包含这个`PO`这样处理业务逻辑是，可以针对`BO`去处理。封装业务逻辑的java对象，通过调用`DAO`方法，结合`PO,VO`进行业务操作。

- `POJO`即`Plain Ordinary Java Object`:
  简单无规则的java对性，即在一些`O/R` 映射工具中，能做到维护数据库表记录的PO完全是一个符合`Java Bean`规范的纯`java`对象

  给大家安利一个工具：`mapStruct`,只需要定义一个接口就可以实现两个实体类属性相互赋值

##### 2.DAO层（mapper接口和文件）:数据操作

- 什么是`DAO`

  1.`Data Access Object`（数据存取对象）

  2.位于业务逻辑和持久化数据之间

  3.实现对持久化数据的访问

  通俗来讲，就是将数据库操作都封装起来。

- `DAO`模式的作用

  1隔离业务逻辑代码和数据访问代码

  2.隔离不同数据库的实现

- `DAO`模式的组成部分

  `DAO`接口

  `DAO`实现类

  实体类（`domain`）

  数据库连接和关闭工具类（`JDBC`）

  `java`的`ORM`框架；`spring`是如何管理`ORM`的；

##### 3.service层（接口和实现类）：业务逻辑的实现

为什么service层要使用接口来定义有以下几点好处： 

- 在java中接口是多继承的，而类是单继承的，如果你需要一个类实现多个service，你用接口可以实现，用类定义service就没那么灵活

- 要提供不同的数据库的服务时，我们只需要面对接口用不同的类实现即可，而不用重复地定义类

- 编程规范问题，接口化的编程为的就是将实现封装起来，然调用者只关心接口不关心实现，也就是“高内聚，低耦合”的思想。

  一个接口多个服务实现类；结合分布式和微服务来的架构；spring是如何管理服务的（`spring-ioc/aop`）；

##### 4.web层：提供对外接口

用Java技术来解决相关web互联网领域的技术总和。`web`包括：`web`服务器和`web`客户端两部分。

- 服务端：

  `servlet、filter、listener`

- 客户端：

  `HTML、JS、CSS`

对于`WEB`开发这来说，理解`servlet`很重要，后续单独介绍`spring` 如何处理封装`servlet` ，由最原始的没有框架到SSM框架（包括`Tomcat`等`servlet`容器运行机制），再到`spring-boot`（内置`servlet`容器）。

> 建议参考网站：<https://www.w3cschool.cn/javaweb/rlh91mtc.html>

#### 三、安利一个快捷开发工具：MybatisCodeHelper

> 官方文档：<https://gejun123456.github.io/MyBatisCodeHelper-Pro/#/

