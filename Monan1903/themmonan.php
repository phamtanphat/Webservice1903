<?php
	require "connect.php";

	$tenmonan = $_GET['Tenmonan'];
	$giamonan = $_GET['Giamonan'];
	$diachi = $_GET['Diachi'];

	$query = "INSERT INTO diadiemmonan VALUES(null,'$tenmonan','$giamonan','$diachi')";
	$data = mysqli_query($con,$query);

	if ($data) {
		echo "success";
	}else{
		echo "fail";
	}
?>