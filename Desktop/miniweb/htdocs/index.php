<?php include 'db.php'; ?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Mis Películas Favoritas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/css/styles.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <h1 class="text-center mb-4">🎬 Mis Películas Favoritas</h1>
    <div class="row">
        <?php
        $stmt = $pdo->query("SELECT * FROM peliculas");
        while ($row = $stmt->fetch()):
        ?>
            <div class="col-md-6 col-lg-4 mb-4">
                <div class="card h-100">
                    <img src="<?= $row['imagen'] ?>" class="card-img-top" alt="<?= $row['titulo'] ?>">
                    <div class="card-body">
                        <h5 class="card-title"><?= $row['titulo'] ?></h5>
                        <p><strong>Director:</strong> <?= $row['director'] ?> (<?= $row['anio'] ?>)</p>
                        <button class="btn btn-primary toggle-desc">Mostrar descripción</button>
                        <p class="card-text descripcion mt-2" style="display: none;"><?= $row['descripcion'] ?></p>
                    </div>
                </div>
            </div>
        <?php endwhile; ?>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="script.js"></script>
</body>
</html>
