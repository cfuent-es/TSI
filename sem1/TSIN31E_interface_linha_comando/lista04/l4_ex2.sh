#!/usr/bin/bash

nums=0

for count in {0..100}; do
    if !(($count % 2)); then
        if [ $count -lt 10 ]; then
            echo -n "0"
        fi
        echo -n "$count "
        ((nums++))
    fi

    if [ $nums == 10 ]; then
        echo ""
        nums=0
    fi
done

echo -e "\n"