package org.example.이론;

public class p_스프링시큐리티 {
    // 스프링 시큐리티
    // : 스프링 기반 애플레케이션(인증,인가, 권한)을 담당하는 스프링 하위 프레임 워크
    // >> 다양한 애너테이션으로 CSRF 공격 , 세션 고정 공격을 방어
    // >> 요청 헤더 보안 처리도 가능

    // 1. 인증
    //  : 사용자가 누구인지 확인하는 과정, 신원 입증 과정
    // ex) 시스테미 사용자가 제시한 증거르 ㄹ바탕으로, 그 사용자가 주장하는 인물임을 확인

    // 2. 인가
    // 인증된 사용자가 수행할 수 있는 작업의 범위를 결정
    // 사이트의 특정 부분에 접근할수 있는지 권할 을 설정하는 작업

    // =====스프링 시큐리티의 구조=====
    // : 필터(Filter)를 기반으로 동작

    // 1) SecurityFilterChain
    //  : 스프링 시큐리티의 요청에 대한 보안 처리 과정에서 여러 필터를 순차적으로 적용시킴

    // - sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
    // - UsernamePasswordAuthenticationFilter
    // - DefaultLoginPageGenerationFilter


}
