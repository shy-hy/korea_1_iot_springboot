package org.example.이론;

public class q_JWT {

    // JWT (JSON Web Token)
    // : JSON 객체를 이용하여 사용자의 인증 정보를 안전하게 전달하는 토큰 기반 인증 방식
    // : 서버 >> 클라이언트에게 발급하는 디지털 서명이 된 토큰
    // : 사용자의 인증 상태를 유지하며 서버에 전달
    // : stateless 방식으로 서버에서 세션을 유지할 필요 X (무상태성)

    // - 인가(Authorization)
    //      : JWT에는 사용자 권한 정보가 담길 수 있음
    //      : API또는 리소스에 대한 접근 권한을 부여

    // - Stateless
    //      : 서버가 세션을 저장할 필요 X, 클라이언트가 관리하기 때문에 확장성이 뛰어남

    // 3. 발급받은 JWT를 이용한 인증 방법
    // : HTTP 요청 헤더 중에 Authorization 키값이 "Bearer + JWT 토큰 값을 전달"

    // 4. JWT의 구조
    // .(마침표)를 기준으로 헤더(header), 내용(payload), 서명(signature)으로 이루어짐
    // aaaaa(헤더).bbbbb(내용).ccccc(서명)

    // 1) 헤더
    // : 토큰의 타입과, 해싱 알고리즘 정보를 포함

    // 2) 내용
    // : 사용자 정보나 권한 같은 클레임(claim)을 포함
    // >> Base64로 인코딩 됨, 암호화되지 않기 때문에 중요한 정보 저장 X

    // 3) 서명
    // : header나 payload를 조합해 주어진 비밀키로 서명한 값
    // >> 데이터의 무결성을 보장
}
