> # 개발자 기술 면접 노트 소스 코드 
> Tech interview 관련 소스 코드들의 위치 및 책에서 다루고 있는 주제들을 정리하였습니다.<br>
> 책에는 책의 분량문제로 극히 일부분의 코드만 다뤘고 아래의 내용을 참고하여 책과 같이 코드를 봐주시기 바랍니다. 
> - 알고리즘이나 콜렉션의 경우 오래전 작성한 소스도 있어서 최신 스타일로 바꾸지 않은 에전 코드들을 확인할 수 있습니다.
>   - 해당 코드들을 모던 자바 스타일로 변환하는 훈련을 하세요.  
>   - 함수를 쓰지 않은 형태의 내부 동작들에 대해서 확인할 수 있습니다.
>   - 고전 형태의 코드가 동작을 이해하는데 더 유용할 수 있으므로 변환하지는 않았으니 참고하세요.
> - /src/main/java 하위에 net/harunote 패키지부터 주제별 코드를 모아놨습니다.
> - 본 코드들은 제 개인 Repository에 흩어져 있던 것들을 책을 출간하며 현재의 Repository에 모은 것입니다.
>   - 각각의 커밋 이력들은 Origin Repository에서 확인할 수 있습니다. (주로 2016~2018년 커밋 내역)
>   - 최초 커밋 정보들도 정리하였고, 코드가 바뀌거나 모으는 과정에서 최신 버전으로 변경된 부분도 있으니 주석등을 통해 코드 생성일 정보등을 참고할 수 있습니다.



# 📖 Book
### [연봉 앞자리를 바꾸는] 개발자 기술 면접 노트
######  2024.03.20 한빛미디어 이남희 지음
<img src="https://raw.githubusercontent.com/haru-note/harunote.github/main/image/book.jpg" width="500"/>

> Yes24 - https://www.yes24.com/Product/Goods/125554439
> 
> KyoboBooks - https://product.kyobobook.co.kr/detail/S000212738756


# Algorithm 패키지 
알고리즘 관련 소스코드
> Commits on Jun 30, 2017
> 
> Origin Repository : https://github.com/gliderwiki/java8/tree/master/src/main/java/algorithm

- Complexity  
  - binarySearch 
  - linearSearch
- LFU
  - LFU Cache
- LRU
  - LRU Cache
- Load Banancer 
  - LeastConnections
  - RoundRobinLoad
- Sort
  - ArraySort
  - BubbleSort
  - ComplexSort
  - InsertionSort
  - ListSort
  - MergeSort
  - QuickSort
  - SelectionSort
  - Map Comparator


# Collection 패키지 
Collection Framework의 기본 개념
> Commits on May 28, 2017
> 
> https://github.com/gliderwiki/java8/commits/master/src/main/java/data
> 
- 데이터구조 
  - Deque
  - Queue
  - Stack
  - PriorityQueue

- Set 인터페이스 
- List 인터페이스 
- Map 인터페이스 
  - HashMap 클래스
  - TreeMap 클래스
  - LinkedHashMap 클래스
  - Hashtable 클래스 

- Collection을 이용한 정렬
  - Collecions.sort()를 이용한 정렬
  - Arrays.sort()를 이용한 정렬 
  - Comparable과 Comparator를 통한 정렬 구현 
  - Multi Column에 대한 정렬 처리 

# Pattern
주요 디자인 패턴에 대한 예제 정리. 
> Commits on Sep 9, 2016
> 
> Repository : https://github.com/gliderwiki/designPattern
- 디자인 패턴
  - Adapter
  - Command
  - Decorator
  - Facade
  - Factory method
  - Singleton 
  - Strategy 
  - Template Method

# Java 8
Java 8의 문법적 특징과 예제들. 
> Commits on Aug 22, 2016
> 
> Repository : https://github.com/gliderwiki/java8
- functional
  - consumer
  - function
  - predicate
  - supplier
- lambda
  - comparator
  - runnable
- parameterization

# Quiz
각종 알고리즘 퀴즈 (몸풀기용) 모음, 유명한 문제 및 기본적인 퀴즈 훈련.
여러 알고리즘 훈련 사이트를 참고하거나, 자체적으로 만든 문제들을 포함.
<br>
코드가 이해 안될 경우 반드시 주석의 Description을 참고할것.  
> Commits on May 23, 2017
> 
> https://github.com/gliderwiki/java8/tree/master/src/main/java/quiz


# 정보
#### Rerepository https://github.com/haru-note/tech-interview


#### this source was moved from the link below.
- https://github.com/gliderwiki/java-sample
- https://github.com/gliderwiki/designPattern
- https://github.com/gliderwiki/java8

#### Collection of sources from 2016 to 2023 by VillainsCode