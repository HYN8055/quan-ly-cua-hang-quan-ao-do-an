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
   tendn                VARCHAR(20)          not null,
   manv                 CHAR(5)              not null,
   matkhau              VARCHAR(20)          null,
   CONSTRAINT PK_TAIKHOAN PRIMARY KEY  (tendn)
);


/*==============================================================*/
/* Table: KHACHHANG                                             */
/*==============================================================*/
CREATE TABLE KHACHHANG (
   makh                 CHAR(5)              not null,
   hoten                NVARCHAR2(20)          null,
   sdt                  CHAR(10)             null,
   email                VARCHAR(30)          null,
   CONSTRAINT PK_KHACHHANG PRIMARY KEY (makh)
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
   masp                 CHAR(5)              not null,
   mancc                CHAR(6)              not null,
   tensp                NVARCHAR2(50)        null,
   giaban               NUMBER(20,2)         null,
   giagoc               NUMBER(20,2)         null,
   xuatxu               NVARCHAR2(20)        null,
   soluong              INT                  null,
   CONSTRAINT PK_SANPHAM PRIMARY KEY (masp)
);


/*==============================================================*/
/* Table: HOADON                                                */
/*==============================================================*/
CREATE TABLE HOADON (
   mahd                 CHAR(5)              not null,
   makh                 CHAR(5)              not null,
   manv                 CHAR(5)              not null,
   ngayin               DATE                not null,
   tongtien             NUMBER(20,2)                 not null,
   tinhtrang            NVARCHAR2(30)          not null,
   CONSTRAINT PK_HOADON PRIMARY KEY  (mahd)
);


/*==============================================================*/
/* Table: CTHD                                                  */
/*==============================================================*/
CREATE TABLE CTHD (
   mahd                 CHAR(5)              not null,
   masp                 CHAR(5)              not null,
   slsp                 INT                 null,
   tongtien             NUMBER(20,2)                 null,
   CONSTRAINT PK_CTHD PRIMARY KEY (mahd, masp)
);


/*==============================================================*/
/* Table: PHIEUNHAPHANG                                         */
/*==============================================================*/
CREATE TABLE PHIEUNHAPHANG (
   mapnh                CHAR(6)              not null,
   mancc                CHAR(6)              not null,
   manv                 CHAR(5)              not null,
   ngaynhap             DATE           null,
   tongtien             NUMBER(20,2)                 null,
   tinhtrang            NVARCHAR2(30)          null,
   CONSTRAINT PK_PHIEUNHAPHANG PRIMARY KEY  (mapnh)
);

/*==============================================================*/
/* Table: CTNHAP                                                */
/*==============================================================*/
CREATE TABLE CTNHAP (
   mapnh                CHAR(6)              not null,
   masp                 CHAR(5)              not null,
   soluong              INT                  null,
   gianhap              NUMBER(20,2)                 null,
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
   ADD CONSTRAINT FK_HD_KH FOREIGN KEY (makh)
      REFERENCES KHACHHANG (makh);

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

-- KHACHHANG
INSERT INTO KHACHHANG VALUES ('KH001','Nguyen Van A','0923617395','nguyenvana@gmail.com');
INSERT INTO KHACHHANG VALUES ('KH002', 'Tran Thi B', '0912345678', 'tranthib@gmail.com');
INSERT INTO KHACHHANG VALUES ('KH003', 'Le Van C', '0987654321', 'levanc@gmail.com');
INSERT INTO KHACHHANG VALUES ('KH004', 'Phamj Thi D', '0933333333', 'phamthid@gmail.com');
INSERT INTO KHACHHANG VALUES ('KH005', 'Hoang Van E', '0977777777', 'hoangvane@gmail.com');
INSERT INTO KHACHHANG VALUES ('KH006', 'Dinh Thi F', '0966666666', 'dinhthif@gmail.com');
INSERT INTO KHACHHANG VALUES ('KH007', 'Vu Van G', '0911111111', 'vuvang@gmail.com');
INSERT INTO KHACHHANG VALUES ('KH008', 'Tran Van H', '0944444444', 'tranvanh@gmail.com');
INSERT INTO KHACHHANG VALUES ('KH009', 'Le Thi I I', '0988888888', 'lethii@gmail.com');
INSERT INTO KHACHHANG VALUES ('KH010', 'Nguyen Thanh K', '0999999999', 'nguyenthan@gmail.com');

-- NHACUNGCAP
INSERT INTO NHACUNGCAP VALUES ('NCC001','Do Han Quoc','123 Nguyen Van Cu','0374527184','xmnm@gmial.com');
INSERT INTO NHACUNGCAP VALUES ('NCC002', 'Do hang gia re', '456 Lang Thanh', '0369852147', 'dtgsaigon@gmail.com');

-- NHANVIEN
INSERT INTO NHANVIEN VALUES ('NV001',' Hoang Thu Cuc','12 To Hien Thanh','9473625475','ngh@gmail.com');
INSERT INTO NHANVIEN VALUES ('NV002', 'Nguyen Van B', '15 Nguyen Hue', '9876543210', 'nvb@gmail.com');
INSERT INTO NHANVIEN VALUES ('NV003', 'Le Thi A', '20 Tran Hung Dao', '9362587410', 'lta@gmail.com');
INSERT INTO NHANVIEN VALUES ('NV004', 'Tran Van D', '30 Le Loi', '9456213785', 'tvd@gmail.com');

-- SANPHAM
INSERT INTO SANPHAM (masp, mancc, tensp, giaban, giagoc, xuatxu, soluong) 
VALUES ('SP001', 'NCC001', 'jean', 0.11, 0.8, 'Viet Nam', 50);

INSERT INTO SANPHAM (masp, mancc, tensp, giaban, giagoc, xuatxu, soluong) 
VALUES ('SP002', 'NCC002', 'ao nam', 0.33, 0.2, 'Viet Nam', 30);

INSERT INTO SANPHAM (masp, mancc, tensp, giaban, giagoc, xuatxu, soluong) 
VALUES ('SP003', 'NCC001','ao nu', 1.33, 1.1, 'Viet Nam', 40);

INSERT INTO SANPHAM (masp, mancc, tensp, giaban, giagoc, xuatxu, soluong) 
VALUES ('SP004', 'NCC002', 'chan vay', 2.56, 2.13, 'Viet Nam', 25);

INSERT INTO SANPHAM (masp, mancc, tensp, giaban, giagoc, xuatxu, soluong) 
VALUES ('SP005', 'NCC002', 'ao thun', 1.67, 1.12, 'Viet Nam', 35);

-- TAIKHOAN
INSERT INTO TAIKHOAN (tendn, manv, matkhau) 
VALUES ('user001', 'NV001', 'password001');

INSERT INTO TAIKHOAN (tendn, manv, matkhau) 
VALUES ('user002', 'NV002', 'password002');

INSERT INTO TAIKHOAN (tendn, manv, matkhau) 
VALUES ('user003', 'NV003', 'password003');

INSERT INTO TAIKHOAN (tendn, manv, matkhau) 
VALUES ('user004', 'NV004', 'password004');

-- PHIEUNHAPHANG
INSERT INTO PHIEUNHAPHANG (mapnh, mancc, manv, ngaynhap, tongtien, tinhtrang) 
VALUES ('PNH001', 'NCC001', 'NV001', TO_DATE('2024-04-05 08:00:00', 'YYYY-MM-DD HH24:MI:SS'), 3.34, 'dang xu li');

INSERT INTO PHIEUNHAPHANG (mapnh, mancc, manv, ngaynhap, tongtien, tinhtrang) 
VALUES ('PNH002', 'NCC002', 'NV002', TO_DATE('2024-04-06 10:30:00', 'YYYY-MM-DD HH24:MI:SS'), 5.12, 'hoan thanh');

INSERT INTO PHIEUNHAPHANG (mapnh, mancc, manv, ngaynhap, tongtien, tinhtrang) 
VALUES ('PNH003', 'NCC001', 'NV003', TO_DATE('2024-04-07 09:45:00', 'YYYY-MM-DD HH24:MI:SS'), 3.45, 'hoan thanh');

-- CTNHAP
INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) 
VALUES ('PNH001', 'SP001', 50, 45.3);

INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) 
VALUES ('PNH002', 'SP002', 30, 24.7);

INSERT INTO CTNHAP (mapnh, masp, soluong, gianhap) 
VALUES ('PNH003', 'SP003', 40, 6.78);

-- HOADON
INSERT INTO HOADON (mahd, makh, manv, ngayin, tongtien, tinhtrang) 
VALUES ('HD001', 'KH001', 'NV001', TO_DATE('2024-04-05 08:30:00', 'YYYY-MM-DD HH24:MI:SS'), 12.12, 'Hoan thanh');

INSERT INTO HOADON (mahd, makh, manv, ngayin, tongtien, tinhtrang) 
VALUES ('HD002', 'KH002', 'NV002', TO_DATE('2024-04-06 09:45:00', 'YYYY-MM-DD HH24:MI:SS'), 2.22, 'Dang xu ly');

INSERT INTO HOADON (mahd, makh, manv, ngayin, tongtien, tinhtrang) 
VALUES ('HD003', 'KH003', 'NV003', TO_DATE('2024-04-07 10:50:00', 'YYYY-MM-DD HH24:MI:SS'), 6.7, 'Hoan thanh');

-- CTHD
INSERT INTO CTHD (mahd, masp, slsp, tongtien) 
VALUES ('HD001', 'SP001', 2, 4.56);

INSERT INTO CTHD (mahd, masp, slsp, tongtien) 
VALUES ('HD001', 'SP002', 1, 23.78);

INSERT INTO CTHD (mahd, masp, slsp, tongtien) 
VALUES ('HD002', 'SP003', 3, 7.89);

INSERT INTO CTHD (mahd, masp, slsp, tongtien) 
VALUES ('HD002', 'SP004', 1, 56.7);

INSERT INTO CTHD (mahd, masp, slsp, tongtien) 
VALUES ('HD003', 'SP001', 2, 45.6);

INSERT INTO CTHD (mahd, masp, slsp, tongtien) 
VALUES ('HD003', 'SP003', 2, 13.4);

SELECT * FROM SANPHAM;