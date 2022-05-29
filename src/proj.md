### 함수형 프로그래밍
- 특징
    - 상태가 없음
    - 대입문이 없음
    - 부작용 이 없는 순수함수
    - 불변성
- 역사: 오래되었다
  - 1930, 람다대수
  - 1954, IPL
  - 1958, LIST
  - 1990, Haskel

### 함수형 엔드포인트
- Spring Web 의 엔드포인트를 함수형 스타일로 작성하는 방법을 제공
  - WebMvc.fn
  - routing, request handling
  - 불변성을 고려하여, 설계됨
  - 기존의 DispatcherServlet 위에서 동작
  - 애노테이션 스타일과 함께 사용 가능