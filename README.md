
## 2021年1月6日 01点18分
```text
今天在httpAspect中添加了@around环绕日志拦截功能
1. @around可以有效的解决掉@Before和@AfterReturning配合打印数据出现的请求和返回结果不在同一行的错误
@around的请求和返回值都是在一个方法中
2. request.getinputstream() 只能读取一次 所以在这个切面中是不能这样使用的，这样的使用会让json数据无法正常读取
采用jp.getArgs()方法是可以读取对应的数据的，但是这个读取的是标记在controller方法体中的对象数据
例如：
@RequestMapping("/testJson2")
public MyResultVO<Object> testJson2(@RequestBody @Validated Test test,
BindingResult bindingResult ) {}
这样jp.getArgs()获取的就是test和bindingResult这两个参数的值
ps:在这里使用过滤将BindingResult结果给过滤掉了 这样打印结果会更加的清晰
    inputStream无法重复读取的原因：
    一个InputStream对象在被读取完成后，将无法被再次读取，始终返回-1；
    InputStream并没有实现reset方法（可以重置首次读取的位置），无法实现重置操作；
    如果是：普通的参数请求因为使用的是request.getParameter()方法倒也是无所谓的
```


##2020年11月14日
```text
16点17分今天是第一次提交我的趣报名小程序api的第一个大版本的内容
```
