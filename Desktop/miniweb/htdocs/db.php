<?php
$host = 'sql308.infinityfree.com';
$db = 'if0_39078679_miniweb';
$user = 'if0_39078679';
$pass = 'Eferrari11';
$charset = 'utf8mb4';

$dsn = "mysql:host=$host;dbname=$db;charset=$charset";

try {
    $pdo = new PDO($dsn, $user, $pass);
} catch (PDOException $e) {
    echo "Error en la conexión: " . $e->getMessage();
    exit();
}
?>
