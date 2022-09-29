a : 8 bits each -> char array
b : char t[L] = {51, -29, 63, -9, -1};
    51 = 32 + 16 + 2 + 1
    51 = : 0b00110011

    29 = 16 + 8 + 4 + 1
    29 = : 0b00011101
    -29 =: 0b11100011 {2s complement}

    63 = 32 + 16 + 8 + 4 + 2 + 1
    63 = : 0b00111111

    9 = 8 + 1
    -9 = : 0b10001010 {2s complement}

    -1 = : 0b10000010 {2s complement}

c :

    a: count the number of ones present in the char array
    b: store the number of iterations made to exit from first while loop(ends up to index y of the char[] array. accessing each char in the array up to y while doing so),
    r: contains the max number of ones present within the array
    d: count the total number of left shifts made on the char being compared

d: 
    finds the char, which has the most 1s present in its binary form within the array[0:y];


2.
    //refer q2.c


3.
    loop:
    slt $t8 [ $s2 $s1 ]    // k = j <= i  ? 1 : 0
    b[eq $t8, $0 ], end    // if(k == 0){ break}  -> j !<= i then break
    addi $s3  $s2 -1       // p = j-1
    sll $s3, $s3, 2        // p <<= 2 *= 4
    add $t4 $s0 $s3        // q = addrArr + 4(j) -> addr of that pointer
    . . .
    slt $s5 $t0 $t1        // r = a[j-1] <= a[j]  ? 1 : 0
    beq $s5, $0, skip      // if(r == 0 ), skip
    sw $t5 0($t0)          // store swap
    sw $t4 0($t1)          // store swap



3b. 
    0000 0001 0111 0010 0000 0000 0000 0010
    0x01720002

4.
    regdst 0/1 (doesnt matter)   aluop 01
    regwrite 0                   iszero 1
    alusrc 0                     sign extend output 1
    PCSRC 1                      A* 0x214
    aluControl 10                B* 1
    memread 0                    31 - 26: 0b000004
    memwrite 0                   25 - 21: 0b001000
    memtoreg 0                   20 - 16: 0b011000
    writeData 0x00000000         L1     : 0b010000
    

