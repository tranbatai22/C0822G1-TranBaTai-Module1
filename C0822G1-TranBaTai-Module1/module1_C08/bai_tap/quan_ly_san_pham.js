let danhSachSanPham = ["iphone", "Nokia", "samSung"];
hienThi()

function hienThi() {

    let data =
        "<table border=\"1\">\n" +
        "    <tr>\n" +
        "        <td>stt</td>\n" +
        "        <td>Tên Sản Phẩm</td>\n" +
        "        <td>Xoá</td>\n" +
        "        <td>Thêm</td>\n" +
        "    </tr>\n"
    for (let i = 0; i < danhSachSanPham.length; i++) {
        data += "<tr>\n" +
            "        <td>" + i + " </td>\n" +
            "        <td>" + danhSachSanPham[i] + "</td>\n" +
            "        <td><input type='button'  value='xoa' onclick='xoa(" + i + ")'></td>\n" +
            "        <td><input type='button'  value='chinh sua' onclick='sua(" + i + ")'></td>\n" +
            "    </tr>"
    }

    data += "</table>"
    document.getElementById("display").innerHTML = data;
    document.getElementById("soLuong").innerHTML = danhSachSanPham.length;
}

function add() {
    let sanPham = document.getElementById("nhap").value
    if (sanPham != "") {
        danhSachSanPham.push(sanPham);
    } else {
        alert("vui lòng điền tên sản phẩm");
    }
    document.getElementById("nhap").value = "";
    hienThi()
}

function xoa(index) {
    let xacNhanXoa = confirm("bạn có muốn xoá sản phẩm : " + danhSachSanPham[index]);
    if (xacNhanXoa) {
        danhSachSanPham.splice(index, 1);
    }
    hienThi();
}

function sua(index) {
    let suaElement = prompt("sua san pham  " + danhSachSanPham[index] + " thanh ")
    danhSachSanPham[index] = suaElement;
    hienThi()
}