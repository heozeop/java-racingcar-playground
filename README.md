## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

# String Calculator
## 요구사항 정리
### 목록
- [x] 쉼표 또는 콜론을 구분자로 가지는 문자열을 split 함
- [x] '//' 와 '\n' 사이의 문자를 커스텀 구분자로 사용하여 split하기
- [x] split한 문자열을 숫자로 변환해 덧셈하기
- [x] 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException throw
- [x] 빈문자열 또는 null 값을 입력할 경우 0반환
- [x] 숫자 하나만 입력하면 숫자 반환
- 
### 유의 사항
- indent 1단계
- 메소드 크기를 10라인 내로
- else 없이
