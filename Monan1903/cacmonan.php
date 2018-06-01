<?php
	require "connect.php";

	$query = "SELECT * FROM diadiemmonan";
	$data = mysqli_query($con,$query);
	
//Bước 1 : Tạo cấu trúc trả về json
	class Monan{
		function Monan($id,$tenmonan,$giamonan,$diadiem){
			$this->Id= $id;
			$this->Tenmonan = $tenmonan;
			$this->Giamonan = $giamonan;
			$this->Diadiem = $diadiem;
		}
	}	
//Bước 2 : Tạo mảng
	$mangmonan = array();
//Bước 3 : Đưa dữ liệu vào trong mảng
	while ($row = mysqli_fetch_assoc($data)) {
		array_push($mangmonan, new Monan($row['Id']
										,$row['Tenmonan']
										,$row['Giamonan']
										,$row['Diadiem']));
	}
// Bước 4 : in ra json
	echo json_encode($mangmonan);
?>