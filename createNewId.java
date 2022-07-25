{\rtf1\ansi\ansicpg949\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset129 AppleSDGothicNeo-Regular;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String solution(String new_id) \{\
        String answer = new_id.toLowerCase(); // 1
\f1 \'b4\'dc\'b0\'e8
\f0 \
\
        answer = answer.replaceAll("[^-_.a-z0-9]", ""); // 2
\f1 \'b4\'dc\'b0\'e8
\f0 \
        answer = answer.replaceAll("[.]\{2,\}", "."); // 3
\f1 \'b4\'dc\'b0\'e8
\f0 \
        answer = answer.replaceAll("^[.]|[.]$", "");    // 4
\f1 \'b4\'dc\'b0\'e8
\f0 \
        \
        if (answer.equals("")) \{    // 5
\f1 \'b4\'dc\'b0\'e8
\f0 \
            answer += "a";\
        \}\
\
        if (answer.length() >= 16) \{     // 6
\f1 \'b4\'dc\'b0\'e8
\f0 \
            answer = answer.substring(0, 15);\
            answer = answer.replaceAll("[.]$","");\
        \}\
\
        if (answer.length() <= 2) \{  // 7
\f1 \'b4\'dc\'b0\'e8
\f0 \
            while (answer.length() < 3) \{\
                answer += answer.charAt(answer.length()-1);\
            \}\
        \}\
        return answer;\
    \}\
\}}