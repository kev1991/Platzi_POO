<?php

    require_once('Car.php');
    require_once('UberX.php');
    require_once('User.php');
    require_once('Driver.php');
    require_once('Account.php');
    echo"_______________WELCOME TO UBER_______________";
    echo"</br>";
    $uberX = new UberX("CVB-123", new Account("Kebin Martinez", "adn123456"), "Chevrolet", "Spark");
    $uberX->print_data_car();
    echo"______________________________";
    $user = new User("Valeria Godoy","123456ASD");
    $user->print_data_user();
    echo"</br>";
    echo"______________________________";
    $driver = new Driver("Kebin Martinez","95699DRS");
    $driver->print_data_Driver();
?>