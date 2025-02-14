<!-- Header -->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Autenticação/Sessão</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.php">Início</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="create.php">Novo Usuário</a>
                </li>
            </ul>
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <?php if (!isset($_SESSION['usuario_id'])) { ?>
                        <a class="nav-link" href="login.php">Login</a>
                    <?php } else { ?>
                        <a class="nav-link" href="logout.php">Logout</a>
                    <?php } ?>
                </li>
            </ul>
        </div>
    </div>
</nav>
<!-- Fim do Header -->