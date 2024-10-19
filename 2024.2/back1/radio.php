<?php

if(isset($_POST["sistema"]))
    echo "Seu sistema operacional: " . $_POST["sistema"] . "<br>";

if(isset($_POST["monitor"]))
    echo "Seu monitor é: " . $_POST["monitor"] . "<br>";