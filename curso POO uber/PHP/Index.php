<?php

    require_once('Car.php');
    require_once('UberX.php');
    require_once('UberPool.php');
    require_once('Account.php');

    $uberX = new UberX("CVB-123", new Account("Kebin Martinez", "adn123456"), "Chevrolet", "Spark");
    $uberX->print_data_car();

    $ubelPool = new UberPool("AWE-214", new Account("Valera Godoy", "ASD123"), "Dodge", "Attitude");
    $ubelPool->print_data_car();
?>