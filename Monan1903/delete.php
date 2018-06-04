<?php
	require "connect.php";

	$idmonan = $_POST['Idmonan'];
	

	$query = "DELETE FROM diadiemmonan WHERE Id = '$idmonan'";
	$data = mysqli_query($con,$query);

	if ($data) {
		echo "success";
	}else{
		echo "fail";
	}
?>