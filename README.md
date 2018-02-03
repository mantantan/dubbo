# dubbo demo项目
zk和dubbo-admin因为太大，放在网盘链接：https://pan.baidu.com/s/1htMEDm8 密码：0n9z，本项目只有dubbo项目。
### 文件说明：
- [x] 1、zk.zip是配合好的zk服务，三台zk服务伪集群
- [x] 2、dubbo-admin是配置好的dubbo的服务治理，放在tomcat的应用目录下，解压zip后可以直接启用。用户名已配置在properties中
- [x] 3、dubbo.zip是写的dubbo rpc调用的远程服务，服务提供者和消费者配置到一起了。

### 启动服务顺序【因为是本地模拟，端口号不要重复】：
1.先启动zk，执行start1.bat、start2.bat、start3.bat
2.启动dubbo-admin工程
3.启动dubbo工程  

进入admin后台可以看到服务已经被管理，现在可以试试调用RPC了。
部署说明可参考[：http://blog.csdn.net/mantantan/article/details/79186436]
