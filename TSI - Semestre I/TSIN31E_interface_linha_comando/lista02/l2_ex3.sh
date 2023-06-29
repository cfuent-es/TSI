#!/usr/bin/bash
read -p "Entre com a temperatura em Fahrenheit: " temp_f
temp_c=$(( ($temp_f - 32) * 5 / 9 ))
echo $temp_c"C =" $temp_f"F"
