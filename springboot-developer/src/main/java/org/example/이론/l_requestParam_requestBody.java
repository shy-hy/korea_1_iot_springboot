package org.example.이론;

public class l_requestParam_requestBody {

    // @RequestParam & @RequestBody
    // : Spring에서 클라이언트로부터 데이터를 받는 방식

    // 1. @RequestParam
    // : 클라이언트가 URL 쿼리 스트링 또는 폼 데이터로 전달한 데이터를
    //  , 컨드롤러 메서드의 파라미터로 받을 때 사용
    // >> 주로 GET 요청에서 많이 사용
    // >> 데이터를 url 뒤에 붙여서 전달하는 경우

    // - url에서 데이터를 전달할 때: 검색 조건 , 필터링 드으이 간단한 데이터를 요청 할 때
    // - get 요청
    // - 보안에 덜 민감한 데이터

    // +) @RequestParam 기본값 해제 & 기본값 설정
    // : @RequestParam 값이 없을 경우 오류
    // 1) 필수값 설정 해제
    // public String getName(@RequestParam(required = false) String name){
    // }

    // 2) 기본 값 설정
    // public String getName(@RequestParam(required = false) String name){
    // }

    // 2. @RequestBody
    // : HTTP요청의 본문에 담긴 json 또는 xml 같은 데이터를
    //  , 객체로 변환하여 받을 때 사용
    // >> 주로 post,put, delete와 같은 요청에서 데이터를 전송 할 때 사용

    // - post/put 요청에서 데이터를 전달
    // - 복잡한 데이터 구조: 주로 DTO(Data Transfer Object)를 사용해 데이터를 변환
    // - 보안이 중요한 경우
}
