#!/bin/bash
make compile
rm -rf output/
mkdir output/
for i in {1..23}
do
    make execute < inputs/input$i.txt > output/output$i.txt
done