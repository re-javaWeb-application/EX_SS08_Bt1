Phần 1
Lỗi xảy ra vì:

@NotNull chỉ chặn giá trị null, không chặn chuỗi rỗng "" hoặc chuỗi toàn khoảng trắng " ". Vì vậy người dùng nhập vài phím Space vẫn qua validation và lọt vào database.
Controller thiếu @Valid trước @RequestBody, nên Bean Validation không được kích hoạt ở tầng backend. Postman gửi request bỏ qua frontend thì server không validate DTO, dữ liệu lỗi đi tiếp xuống logic/database và có thể gây 500 Internal Server Error.