//*==============================================================*/
//* Database: QLCHQA                                        */
//*==============================================================*/

//*==============================================================*/
//* Table: NHANVIEN                                              */
//*==============================================================*/

CREATE TABLE  NHANVIEN (
   manv                 CHAR(5)              not null,
   hoten                NVARCHAR2(20)          null,
   diachi               NVARCHAR2(50)          null,
   sdt                  CHAR(10)              null,
   email                VARCHAR(30)           null,
   CONSTRAINT PK_NHANVIEN PRIMARY KEY (manv)
);

/*==============================================================*/
/* Table: TAIKHOAN                                              */
/*==============================================================*/
CREATE TABLE TAIKHOAN (
   manv                 CHAR(5)              not null,
   tendn                VARCHAR(20)          not null,
   matkhau              VARCHAR(20)          null,
   role					VARCHAR(20)          not null,	
   trangthai			INT     			 not null,
   CONSTRAINT PK_TAIKHOAN PRIMARY KEY  (tendn)
);

/*==============================================================*/
/* Table: NHACUNGCAP                                            */
/*==============================================================*/
CREATE TABLE NHACUNGCAP (
   mancc                CHAR(6)              not null,
   tenncc               NVARCHAR2(30)          null,
   diachi               NVARCHAR2(50)          null,
   sdt                  CHAR(10)             null,
   email                VARCHAR(30)          null,
   CONSTRAINT PK_NHACUNGCAP PRIMARY KEY (mancc)
);


/*==============================================================*/
/* Table: SANPHAM                                               */
/*==============================================================*/
CREATE TABLE SANPHAM (
   masp                 CHAR(95)             not null,
   tensp                NVARCHAR2(50)        null,
   giaban               NUMBER(20,2)         null,
   gianhap              NUMBER(20,2)         null,
   soluong              INT                  null,
   kichthuoc            CHAR(10)             null,
   chatlieu             NVARCHAR2(50)        null, 
   mancc                CHAR(6)              not null,
   xuatxu               NVARCHAR2(20)        null,
   
   CONSTRAINT PK_SANPHAM PRIMARY KEY (masp)
);


/*==============================================================*/
/* Table: HOADON                                                */
/*==============================================================*/
CREATE TABLE HOADON (
   mahd                 CHAR(5)              not null,
   manv                 CHAR(5)              not null,
   ngayin               DATE                 not null,
   tongtien             NUMBER(20,2)          not null,
   CONSTRAINT PK_HOADON PRIMARY KEY  (mahd)
);


/*==============================================================*/
/* Table: CTHD                                                  */
/*==============================================================*/
CREATE TABLE CTHD (
   mahd                 CHAR(5)              not null,
   masp                 CHAR(5)              not null,
   slsp                 INT                  null,
   giaban               NUMBER(20,2)         null, 
   CONSTRAINT PK_CTHD PRIMARY KEY (mahd, masp)
);


/*==============================================================*/
/* Table: PHIEUNHAPHANG                                         */
/*==============================================================*/
CREATE TABLE PHIEUNHAPHANG (
   mapnh                CHAR(6)              not null,
   mancc                CHAR(6)              not null,
   manv                 CHAR(5)              not null,
   ngaynhap             DATE                 null,
   tongtien             NUMBER(20,2)          null,
   tinhtrang            NVARCHAR2(30)          null,
   CONSTRAINT PK_PHIEUNHAPHANG PRIMARY KEY  (mapnh)
);

/*==============================================================*/
/* Table: CTNHAP                                                */
/*==============================================================*/
CREATE TABLE CTNHAP (
   mapnh                CHAR(6)              not null,
   masp                 CHAR(5)              not null,
   masp                 CHAR(5)              not null,
   tensp                NVARCHAR2(50)        null,
   slsp                 INT                  null,
   gianhap              NUMBER(20,2)         null, 
   tongtien             NUMBER(20,2)         null,
   CONSTRAINT PK_CTNHAP PRIMARY KEY (mapnh, masp)
);


/*==============================================================*/
/* FOREIGN KEY                                               */
/*==============================================================*/

ALTER TABLE TAIKHOAN
   ADD CONSTRAINT FK_TK_NV FOREIGN KEY (manv)
      REFERENCES  NHANVIEN (manv);

ALTER TABLE SANPHAM
   ADD CONSTRAINT FK_SP_NCC FOREIGN KEY (mancc)
      REFERENCES NHACUNGCAP (mancc);

ALTER TABLE HOADON
   ADD CONSTRAINT FK_HD_NV FOREIGN KEY (manv)
      REFERENCES NHANVIEN (manv);

ALTER TABLE CTHD
   ADD CONSTRAINT FK_CTHD FOREIGN KEY (mahd)
      REFERENCES HOADON (mahd);


ALTER TABLE CTHD
   ADD CONSTRAINT FK_CTHD2 FOREIGN KEY (masp)
      REFERENCES SANPHAM (masp);

ALTER TABLE PHIEUNHAPHANG
   ADD CONSTRAINT FK_PNH_NV FOREIGN KEY (manv)
      REFERENCES NHANVIEN (manv);

ALTER TABLE PHIEUNHAPHANG
   ADD CONSTRAINT FK_PMH_NCC FOREIGN KEY (mancc)
      REFERENCES NHACUNGCAP (mancc);

ALTER TABLE CTNHAP
   ADD CONSTRAINT FK_CTNHAP FOREIGN KEY (mapnh)
      REFERENCES PHIEUNHAPHANG (mapnh);

ALTER TABLE CTNHAP
   ADD CONSTRAINT FK_CTNHAP2 FOREIGN KEY (masp)
      REFERENCES SANPHAM (masp);


/*==============================================================*/
/* INSERT VALUE                                              */
/*==============================================================*/

-- NHACUNGCAP
INSERT INTO NHACUNGCAP VALUES ('NCC1', 'Coolmate', '165 Tr?n Tr?ng Cung, Tân Thu?n ?ông, Qu?n 7, Thành ph? H? Chí Minh', '0374527184', 'coolmate@gmail.com');
INSERT INTO NHACUNGCAP VALUES ('NCC2', 'ABC Company', '123 Nguy?n V?n Linh, Qu?n 1, Thành ph? H? Chí Minh', '0987654321', 'abc@example.com');
INSERT INTO NHACUNGCAP VALUES ('NCC3', 'XYZ Corporation', '456 Lê L?i, Qu?n 2, Thành ph? H? Chí Minh', '0123456789', 'xyz@company.com');
INSERT INTO NHACUNGCAP VALUES ('NCC4', 'DEF Enterprises', '789 Ph?m V?n ??ng, Qu?n 3, Thành ph? H? Chí Minh', '0909090909', 'def@enterprises.com');
INSERT INTO NHACUNGCAP VALUES ('NCC5', 'GHI Ltd.', '321 Tr?n H?ng ??o, Qu?n 4, Thành ph? H? Chí Minh', '0765432109', 'ghi@ltd.com');
INSERT INTO NHACUNGCAP VALUES ('NCC6', 'JKL Group', '654 Nguy?n ?ình Chi?u, Qu?n 5, Thành ph? H? Chí Minh', '0912345678', 'jkl@group.com');
INSERT INTO NHACUNGCAP VALUES ('NCC7', 'MNO Corporation', '987 Cách M?ng Tháng Tám, Qu?n 6, Thành ph? H? Chí Minh', '0988776655', 'mno@corporation.com');
INSERT INTO NHACUNGCAP VALUES ('NCC8', 'PQR Industries', '111 ?i?n Biên Ph?, Qu?n 7, Thành ph? H? Chí Minh', '0888666999', 'pqr@industries.com');
INSERT INTO NHACUNGCAP VALUES ('NCC9', 'STU Corporation', '222 Lý T? Tr?ng, Qu?n 8, Thành ph? H? Chí Minh', '0777888999', 'stu@corporation.com');
INSERT INTO NHACUNGCAP VALUES ('NCC10', 'VWX Co., Ltd.', '333 Nguy?n Hu?, Qu?n 9, Thành ph? H? Chí Minh', '0911223344', 'vwx@coltd.com');
INSERT INTO NHACUNGCAP VALUES ('NCC11', 'YZA Enterprises', '444 Hai Bà Tr?ng, Qu?n 10, Thành ph? H? Chí Minh', '0888777666', 'yza@enterprises.com');
INSERT INTO NHACUNGCAP VALUES ('NCC12', 'BCD Ltd.', '555 Lê Du?n, Qu?n 11, Thành ph? H? Chí Minh', '0999888777', 'bcd@ltd.com');
INSERT INTO NHACUNGCAP VALUES ('NCC13', 'FGH Group', '666 Tr?n Phú, Qu?n 12, Thành ph? H? Chí Minh', '0900112233', 'fgh@group.com');
INSERT INTO NHACUNGCAP VALUES ('NCC14', 'IJK Corporation', '777 Nguy?n V?n C?, Qu?n Bình Th?nh, Thành ph? H? Chí Minh', '0777666555', 'ijk@corporation.com');
INSERT INTO NHACUNGCAP VALUES ('NCC15', 'LMN Industries', '888 Hùng V??ng, Qu?n Gò V?p, Thành ph? H? Chí Minh', '0899888777', 'lmn@industries.com');
INSERT INTO NHACUNGCAP VALUES ('NCC16', 'OPQ Group', '999 ?i?n Biên Ph?, Qu?n Tân Bình, Thành ph? H? Chí Minh', '0911223344', 'opq@group.com');
INSERT INTO NHACUNGCAP VALUES ('NCC17', 'RST Corporation', '1010 Tr??ng Chinh, Qu?n Tân Phú, Thành ph? H? Chí Minh', '0888777666', 'rst@corporation');
INSERT INTO NHACUNGCAP VALUES ('NCC17', 'RST Corporation', '1010 Tr??ng Chinh, Qu?n Tân Phú, Thành ph? H? Chí Minh', '0888777666', 'rst@corporation.com');
INSERT INTO NHACUNGCAP VALUES ('NCC18', 'UVW Enterprises', '1111 L?c Long Quân, Qu?n Bình Tân, Thành ph? H? Chí Minh', '0999888777', 'uvw@enterprises.com');
INSERT INTO NHACUNGCAP VALUES ('NCC19', 'XYZ Ltd.', '1212 Nguy?n V?n Qúa, Qu?n Th? ??c, Thành ph? H? Chí Minh', '0900112233', 'xyz@ltd.com');
INSERT INTO NHACUNGCAP VALUES ('NCC20', 'ABC Group', '1313 B?ch ??ng, Qu?n 12, Thành ph? H? Chí Minh', '0777666555', 'abc@group.com');

-- NHANVIEN
INSERT INTO NHANVIEN VALUES ('NV1',' Ph?m Thu? Th?o Nh?','Long An','365398625','22521055@gm.uit.edu.vn');
INSERT INTO NHANVIEN VALUES ('NV2', 'Hu?nh Y?n Nhi', 'Hu?', '9876543210', '22521034@gm.uit.edu.vn');
INSERT INTO NHANVIEN VALUES ('NV3', 'Võ Thanh Nhàn', 'Phú Yên', '9362587410', '22521008@gm.uit.edu.vn');
INSERT INTO NHANVIEN VALUES ('NV4', 'Hu?nh Ng?c Di?m Phúc', 'Phú Yên', '9456213785', '22521113@gm.uit.edu.vn');

-- SANPHAM
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QA2', 'Qu?n jeans', 250.000, 180.000, 50, 'M', 'Denim', 'NCC2', 'Viet Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QA3', 'Áo khoác', 300.000, 220.000, 30, 'L', 'Polyester', 'NCC3', 'Trung Qu?c');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QA4', 'Qu?n jogger', 180.000, 120.000, 80, 'S', 'V?i thun', 'NCC4', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QA5', 'Áo len', 150.000, 100.000, 60, 'M', 'Len', 'NCC5', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QA6', 'Qu?n kaki', 200.000, 150.000, 70, 'L', 'Kaki', 'NCC6', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QA7', 'Áo thun', 80.000, 50.000, 120, 'XL', 'Cotton', 'NCC7', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QA8', 'Qu?n shorts', 120.000, 90.000, 90, 'M', 'V?i thun', 'NCC8', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QA9', 'Áo hoodie', 220.000, 160.000, 40, 'L', 'V?i n?', 'NCC9', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QA10', 'Qu?n legging', 150.000, 100.000, 100, 'S', 'V?i thun', 'NCC10', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QB1', 'Áo khoác da', 350.000, 280.000, 20, 'L', 'Da', 'NCC11', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QB2', 'Qu?n ?ùi', 90.000, 60.000, 150, 'XL', 'V?i thun', 'NCC12', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QB3', 'Áo n?', 120.000, 90.000, 80, 'M', 'V?i n?', 'NCC8', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QA2', 'Qu?n jeans', 250000, 180000, 50, 'M', 'Denim', 'NCC2', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QA3', 'Áo khoác', 300000, 220000, 30, 'L', 'Polyester', 'NCC3', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QA4', 'Qu?n jogger', 180000, 120000, 80, 'S', 'V?i thun', 'NCC4', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QA5', 'Áo len', 150000, 100000, 60, 'M', 'Len', 'NCC5', 'Vi?t Nam');
INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) 
VALUES ('QA6', 'Qu?n kaki', 200000, 150000, 70, 'L', 'Kaki', 'NCC6', 'Vi?t Nam');

-- TAIKHOAN
INSERT INTO TAIKHOAN (tendn, manv, matkhau, role, trangthai) 
VALUES ('user001', 'NV1', 'password001', 'admin', 1);

INSERT INTO TAIKHOAN (tendn, manv, matkhau, role, trangthai) 
VALUES ('user002', 'NV2', 'password002', 'admin', 1);

INSERT INTO TAIKHOAN (tendn, manv, matkhau, role, trangthai) 
VALUES ('user003', 'NV3', 'password003', 'emp', 1);

INSERT INTO TAIKHOAN (tendn, manv, matkhau, role, trangthai) 
VALUES ('user004', 'NV4', 'password004', 'emp', 1);

SELECT * FROM TAIKHOAN