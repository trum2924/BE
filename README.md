# CAPSTONE PROJECT 
### version:
+ IntelliJ IDEA 2021.1.3 (Ultimate Edition)
+ JDK 17
+ Spring 2.7.5
### Build RestAPI Web Service Using:
+ backend: Spring Boot 2.7.5
+ spring security
+ spring data jpa, hibernate
+ mysql database
+ spring mail

### Description:
+ Web quản lý thư viện, cho phép đối tượng sử dụng : quản lí, ký gửi, thuê sách,
xem trưng bày sản phẩm, tạo giỏ hàng, thanh toán hóa đơn

### Features:
+ phân quyền admin, user
+ quản lí sản phẩm, loại sản phẩm(CRUD)
+ xem sản phẩm, xem chi tiết
+ quản lí giỏ hàng (thêm, xóa)
+ gửi mail khi forgot-password
#### Admin section:
+ categories
+ Quản lý sách
+ Quản lý ký gửi,
+ Quản lý cho thuê sách
+ Post bài 
#### User section:
+ Quản lý sách, ký gửi sách

### Some ideas we need to update:
+ paging
+ search engine

### Something Needs to change before run Server
-mail properties(Tài khoản email sẽ dùng để gửi mail cho người dùng thực hiện chức năng quên mật khẩu)
+email.username = <your email>
+email.password = <your password>

+ spring.datasource.url= jdbc:mysql://<your ip>:3306/capstone_db
+ spring.datasource.username= <?>
+ spring.datasource.password= <?>
+ spring.jpa.hibernate.ddl-auto=none
