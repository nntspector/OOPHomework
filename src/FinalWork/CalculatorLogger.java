����   @ .
      java/lang/Object <init> ()V	  	 
   FinalWork/CalculatorLogger LOGGER Ljava/util/logging/Logger;	      java/util/logging/Level INFO Ljava/util/logging/Level;
      java/util/logging/Logger log .(Ljava/util/logging/Level;Ljava/lang/String;)V
      java/lang/Class getName ()Ljava/lang/String;
    ! " 	getLogger .(Ljava/lang/String;)Ljava/util/logging/Logger; Code LineNumberTable LocalVariableTable this LFinalWork/CalculatorLogger; (Ljava/lang/String;)V message Ljava/lang/String; <clinit> 
SourceFile CalculatorLogger.java !                #   /     *� �    $        %        & '   	  (  #   9     � � *� �    $   
    	 
 
 %        ) *    +   #   $      � � � �    $         ,    -