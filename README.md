# IOTUModle

## Controller
在每个 Controller 上加上 @RestController 注解。
由于前后端分离，需要在 controller 上加上 @CrossOrigin 来支持跨域
controller 中的异常在 catch 块中抛出，统一放在 exception/ExceptionAdvice 类中处理。

## Service
在每个 Service 的实现类上添加 @Service 注解

## Mapper
使用的是 mybatis。在 mapper 文件下定义接口，每个接口上添加 @Mapper 注解。
然后在 resource/mapper 文件目录下定义 mxl 文件。
*注意:接口文件和 xml 文件命名要一致,统一为 ***mapper 这样的形式。另外 xml 中，每个文件的 namespace 需要对应接口路径*

## POJO
在 pojo 下创建各种实体类，建议创建一个统一返回给前端的实力类。可以参考 ResultBean.


## SQL
在 resource/application.yml 下添加数据库连接的驱动和数据库信息。

建议可以先不做登录功能，因为可以使用 shiro 来做相关的权限认证和登录操作。所以在建数据库的时候，需要考虑下权限相关表。