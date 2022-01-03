<?php
    class User extends Account{
        public function __construct($name, $document){
            parent::__construct($name, $document);
        }
    
        public function print_data_user(){
            echo"<br>";
            echo "User";
            echo"<br>";
            echo "Name: $this->name Document:$this->document " ;
            echo "<br>";
        }
    }
?>