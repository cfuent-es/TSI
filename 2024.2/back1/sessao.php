<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <pre>
    <?php
        session_start();
        $_SESSION['noco'] = "noco";
        print_r($_SESSION);
        echo session_id();
    ?>
</body>
</html>