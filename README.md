# 编号规则生成器



一些属性并没有配置注解，那么他一样会在数据库的表中存在，因为这些属性默认就有@Column注解。

因此如果没有添加注解，则hibernate会自动在属性前面添加@Column注解。

使用@Transient这个注解可以让其不成为数据库的字段。
