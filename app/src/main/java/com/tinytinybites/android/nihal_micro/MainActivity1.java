package com.tinytinybites.android.nihal_micro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        ImageView imageView1=(ImageView)findViewById(R.id.imageView1);
        ImageView imageView2=(ImageView)findViewById(R.id.imageView2);
        ImageView imageView3=(ImageView)findViewById(R.id.imageView3);
        ImageView imageView4=(ImageView)findViewById(R.id.imageView4);
        ImageView imageView5=(ImageView)findViewById(R.id.imageView5);
        ImageView imageView6=(ImageView)findViewById(R.id.imageView6);
        ImageView imageView7=(ImageView)findViewById(R.id.imageView7);
        ImageView imageView8=(ImageView)findViewById(R.id.imageView8);
        ImageView imageView9=(ImageView)findViewById(R.id.imageView9);
        ImageView imageView10=(ImageView)findViewById(R.id.imageView10);
        imageView1.setTranslationX(-500f);
        imageView3.setTranslationX(-500f);
        imageView5.setTranslationX(-500f);
        imageView7.setTranslationX(-500f);
        imageView9.setTranslationX(-500f);
        imageView2.setTranslationX(500f);
        imageView4.setTranslationX(500f);
        imageView6.setTranslationX(500f);
        imageView8.setTranslationX(500f);
        imageView10.setTranslationX(500f);
        imageView1.animate().translationXBy(500f).setDuration(1000);
        imageView2.animate().translationXBy(-500f).setDuration(1000);
        imageView4.animate().translationXBy(-500f).setDuration(1000);
        imageView6.animate().translationXBy(-500f).setDuration(1000);
        imageView8.animate().translationXBy(-500f).setDuration(1000);
        imageView10.animate().translationXBy(-500f).setDuration(1000);
        imageView3.animate().translationXBy(500f).setDuration(1000);
        imageView5.animate().translationXBy(500f).setDuration(1000);
        imageView7.animate().translationXBy(500f).setDuration(1000);
        imageView9.animate().translationXBy(500f).setDuration(1000);
        final String intro1="Introduction to the addressing modes";
        final String matter1="Addressing Modes– The term addressing modes refers to the way in which the operand of an instruction is specified. The addressing mode specifies a rule for interpreting or modifying the address field of the instruction before the operand is actually executed.\n" +
                "\n" +
                "Addressing modes for 8086 instructions are divided into two categories:\n" +
                "\n" +
                "1) Addressing modes for data\n" +
                "\n" +
                "2) Addressing modes for branch\n" +
                "\n" +
                "The 8086 memory addressing modes provide flexible access to memory, allowing you to easily access variables, arrays, records, pointers, and other complex data types.  The key to good assembly language programming is the proper use of memory addressing modes.\n" +
                "\n" +
                "\n" +
                "An assembly language program instruction consists of two parts\n" +
                "\n" +
                "am1\n" +
                "The memory address of an operand consists of two components: Optcode and Operand ";
        final String link1="https://www.youtube.com/watch?v=hVRtfcvt1ns";
        final String intro2="Types of addressing modes";
        final String matter2=" 1)      Register Addressing mode\n" +
                "2)      Immediate Addressing mode\n" +
                "3)      Register Indirect Addressing mode\n" +
                "4)      Direct Addressing mode\n" +
                "5)      Indexed Addressing mode\n" +
                "6)      Register Relative Addressing mode\n" +
                "7)      Base Indexed Addressing mode\n"+
                "8)      Base Indexed plus offset mode\n"+
                "9)      Implicit Addressing Mode"
                ;
        final String link2="https://www.youtube.com/watch?v=qNDUBvTEx9s";
        final String intro3="Immediate Addressing";
        final String matter3="An immediate operand has a constant value or an expression. When an instruction with two operands uses immediate addressing, the first operand may be a register or memory location, and the second operand is an immediate constant. The first operand defines the length of the data.\n" +
                "\n" +
                "For example,\n" +
                "\n" +
                "BYTE_VALUE  DB  150    ; A byte value is defined\n" +
                "WORD_VALUE  DW  300    ; A word value is defined\n" +
                "ADD  BYTE_VALUE, 65    ; An immediate operand 65 is added\n" +
                "MOV  AX, 45H           ; Immediate constant 45H is transferred to AX";
        final String link3="https://www.youtube.com/watch?v=rbEyrlRqPt4";
        final String intro4="Register Addressing Mode";
        final String matter4="In this addressing mode, a register contains the operand. Depending upon the instruction, the register may be the first operand, the second operand or both.\n" +
                "\n" +
                "For example,\n" +
                "\n" +
                "MOV DX, TAX_RATE   ; Register in first operand\n" +
                "MOV COUNT, CX\t   ; Register in second operand\n" +
                "MOV EAX, EBX\t   ; Both the operands are in registers\n" +
                "\n" +
                "As processing data between registers does not involve memory, it provides fastest processing of data.";
        final String link4="https://www.youtube.com/watch?v=BZGsuwrM8Tc";
        final String intro5="Direct Memory Addressing";
        final String matter5="When operands are specified in memory addressing mode, direct access to main memory, usually to the data segment, is required. This way of addressing results in slower processing of data. To locate the exact location of data in memory, we need the segment start address, which is typically found in the DS register and an offset value. This offset value is also called effective address.\n" +
                "\n" +
                "In direct addressing mode, the offset value is specified directly as part of the instruction, usually indicated by the variable name. The assembler calculates the offset value and maintains a symbol table, which stores the offset values of all the variables used in the program.\n" +
                "\n" +
                "In direct memory addressing, one of the operands refers to a memory location and the other operand references a register.\n" +
                "\n" +
                "For example,\n" +
                "\n" +
                "ADD\tBYTE_VALUE, DL\t; Adds the register in the memory location\n" +
                "MOV\tBX, WORD_VALUE\t; Operand from the memory is added to register";
        final String link5="https://www.youtube.com/watch?v=BZGsuwrM8Tc";
        final String intro6="Register Indirect Addressing";
        final String matter6="Register indirect addressing mode\n" +
                "\n" +
                "This addressing mode allows data to be addressed at any memory location through an offset address held in any of the following registers: BP, BX, DI & SI.\n" +
                "Example\n" +
                "\n" +
                "MOV AX, [BX]  ; Suppose the register BX contains 4895H, then the contents  \n" +
                "              ; 4895H are moved to AX \n" +
                "ADD CX, {BX} \n";
        final String link6="https://www.youtube.com/watch?v=SF-7zPMIdI0";
        final String intro7="Register Relative";
        final String matter7="In this mode, the operand address is calculated using one of the base registers and an 8 bit or a 16 bit displacement.\n" +
                "\n" +
                "Example:\n" +
                "\n" +
                "MOV CL, [BX + 04H]\n" +
                "\n" +
                "This instruction moves a byte from the address pointed by BX + 4 in data segment to CL.\n" +
                "\n" +
                "CL ← DS: [BX + 04H]\n" +
                "\n" +
                "Physical address can be calculated as DS * 10H + BX + 4H. ";
        final String link7="https://www.youtube.com/watch?v=R6pFW209lfk";
        final String intro8="Based-index addressing mode";
        final String matter8="In this addressing mode, the offset address of the operand is computed by summing the base register to the contents of an Index register.\n" +
                "Example\n" +
                "\n" +
                "ADD CX, [AX+SI], MOV AX, [AX+DI] \n";
        final String link8="https://www.youtube.com/watch?v=N0Zf16SGk3E";
        final String intro9="Based indexed with displacement mode";
        final String matter9="In this addressing mode, the operands offset is computed by adding the base register contents. An Index registers contents and 8 or 16-bit displacement.\n" +
                "Example\n" +
                "\n" +
                "MOV AX, [BX+DI+08], ADD CX, [BX+SI+16] \n";
        final String link9="https://www.youtube.com/watch?v=N0Zf16SGk3E";
        final String intro10="Implied Addressing";
        final String matter10="Implied addressing is an addressing mode which specifies no address at all; instructions like e.g. RTS do not take an address unlike e.g. LDA, and so in assembler source code listings, the \"RTS\" is not followed by an address or other information, whereas LDA always is: This omission of any addressing information at all is referred to as implied addressing.\n" +
                "\n" +
                "Instructions in implied addressing mode only take up a single byte, to hold the opcode. Of the 56 formally defined instructions (see Undocumented opcode), 25 supports this implied addressing mode. Furthermore, none of these 25 instructions support any other addressing modes. They are: BRK, CLC, CLD, CLI, CLV, DEX, DEY, INX, INY, NOP, PHA, PHP, PLA, PLP, RTI, RTS, SEC, SED, SEI, TAX, TAY, TSX, TXA, TXS, and TYA. ";
        final String link10="https://www.youtube.com/watch?v=VF_iSJjqDj8";

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity1.this,description.class);
                intent1.putExtra("Introduction",intro1);
                intent1.putExtra("Matter",matter1);
                intent1.putExtra("link",link1);
                startActivity(intent1);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity1.this,description.class);
                intent2.putExtra("Introduction",intro2);
                intent2.putExtra("Matter",matter2);
                intent2.putExtra("link",link2);
                startActivity(intent2);
            }
        });imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity1.this,description.class);
                intent3.putExtra("Introduction",intro3);
                intent3.putExtra("Matter",matter3);
                intent3.putExtra("link",link3);
                startActivity(intent3);
            }
        });imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(MainActivity1.this,description.class);
                intent4.putExtra("Introduction",intro4);
                intent4.putExtra("Matter",matter4);
                intent4.putExtra("link",link4);
                startActivity(intent4);
            }
        });imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(MainActivity1.this,description.class);
                intent5.putExtra("Introduction",intro5);
                intent5.putExtra("Matter",matter5);
                intent5.putExtra("link",link5);
                startActivity(intent5);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(MainActivity1.this,description.class);
                intent6.putExtra("Introduction",intro6);
                intent6.putExtra("Matter",matter6);
                intent6.putExtra("link",link6);
                startActivity(intent6);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(MainActivity1.this,description.class);
                intent7.putExtra("Introduction",intro7);
                intent7.putExtra("Matter",matter7);
                intent7.putExtra("link",link7);
                startActivity(intent7);
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8=new Intent(MainActivity1.this,description.class);
                intent8.putExtra("Introduction",intro8);
                intent8.putExtra("Matter",matter8);
                intent8.putExtra("link",link8);
                startActivity(intent8);
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9=new Intent(MainActivity1.this,description.class);
                intent9.putExtra("Introduction",intro9);
                intent9.putExtra("Matter",matter9);
                intent9.putExtra("link",link9);
                startActivity(intent9);
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10=new Intent(MainActivity1.this,description.class);
                intent10.putExtra("Introduction",intro10);
                intent10.putExtra("Matter",matter10);
                intent10.putExtra("link",link10);
                startActivity(intent10);
            }
        });
    }
}
