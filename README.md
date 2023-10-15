# 编号规则生成器

一些属性并没有配置注解，那么他一样会在数据库的表中存在，因为这些属性默认就有@Column注解。

因此如果没有添加注解，则hibernate会自动在属性前面添加@Column注解。

使用@Transient这个注解可以让其不成为数据库的字段。

## 日志配置

logback-spring.xml配置文件

1. 根节点configuration
   scan:当此属性设置为 true 时，配置文件如果发生改变，将会被重新加载，默认值为 true 。
   scanPeriod:设置监测配置文件是否有修改的时间间隔，如果没有给出时间单位，默认单位是毫秒。当 scan 为 true
   时，此属性生效。默认的时间间隔为1分钟。
   debug:当此属性设置为 true 时，将打印出 logback 内部日志信息，实时查看 logback 运行状态。默认值为 false 。
2. root节点
   root节点是必选节点，用来指定最基础的日志输出级别，只有一个level属性。

level:用来设置打印级别，大小写无关：TRACE, DEBUG, INFO, WARN, ERROR, ALL 和 OFF，不能设置为INHERITED或者同义词NULL。

默认是INFO。

可以包含零个或多个元素，标识这个appender将会添加到这个loger。

3. property节点
   用来定义变量值的标签， 有两个属性，name和value；其中name的值是变量的名称，value的值时变量定义的值。通过定义的值会被插入到logger上下文中。定义变量后，可以使“${}”来使用变量。

4. appender节点
   appender用来格式化日志输出节点，有两个属性name和class，class用来指定哪种输出策略，常用就是控制台输出策略和文件输出策略。

可以看到 layout 和 encoder ，都可以将事件转换为格式化后的日志记录，但是控制台输出使用 layout ，文件输出使用 encoder 。

5. loger节点
   <loger> 用来设置某一个包或者具体的某一个类的日志打印级别、以及指定 <appender> 。 <loger> 仅有一个 name 属性，一个可选的
   level 和一个可选的 addtivity 属性。

name :用来指定受此loger约束的某一个包或者具体的某一个类。

level :用来设置打印级别，大小写无关：TRACE, DEBUG, INFO, WARN, ERROR, ALL 和
OFF，还有一个特俗值INHERITED或者同义词NULL，代表强制执行上级的级别。如果未设置此属性，那么当前loger将会继承上级的级别。

addtivity :是否向上级loger传递打印信息。默认是true。

日志的传递属性需要特别注意，默认情况下，该属性为true，配置不合理时，会出现重复的日志输出。

通过loger，可以为特定的包设置不同的日志级别，有利于有针对性地输出特定环境的日志信息。

端口被占
netstat -aon|findstr 8888
tasklist|findstr "7780"
taskkill -PID 7780 -F

通常我们会是在Spring框架中使用到@PostConstruct注解 该注解的方法在整个Bean初始化中的执行顺序：

Constructor(构造方法) -> @Autowired(依赖注入) -> @PostConstruct(注释的方法)
