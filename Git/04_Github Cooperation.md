# Git 협업

> 코드를 협업하는 방식. 3가지 협업 모델이 있다.



## 협업이란?

- 협업에서 가장 중요한 것 : **소통**
- 협업은 **독재**
- 수직적 협업



## (1) Push & Pull

> repository를 생성한 후 협업을 할 팀원에게 공유를 허락하여 협업하는 방식

### 절차

1. master가 repository 생성
2. `git clone [repository 주소]` : master의 repository를 자신의 컴퓨터에 복사 
3. `Invite a collaborator` : master가 해당 아이디를 공유 허락 
4. `git push origin master` : repository에 변경 사항 올림
5. `git pull origin master` : repository에 변경사항이 있으면 차이를 불러옴



### 장점

- 단순함
- 기본적인 git 활용만으로 협업 가능



### 단점

- 꼭 공유를 해야지만 협업이 가능
- synchronous한 협업 모델 : 한 사람의 일이 끝나야 다른 사람이 시작 가능
- 2인 이상일 때 코드가 꼬일 가능성이 있음



## (2) Fork & PR

> github 상에서 repository를 가져와서 기존 repository에 반영 요청을 하여 협업하는 방식

### Fork

- 다른 사람의 github repository를 나의 github으로 가져오는 것
- github 상에서 복사를 의미



### PR

- Pull Request의 약자
- 자신이 수정한 내용을 기존 repository에 반영해달라고 요청하는 것을 의미



### Merge PR

- 반영 요청을 수락하는 것의 의미
- 다른 사람이 보낸 PR의 내용을 확인하고 기존 코드에 넣음



### 장점

- 오픈소스 협업
- Asynchronous(비동기적) 협업이 기능



## (3) Branch & PR

> 해당 내용은 수업에서 진행되지 않아 추후 공부해서 다시 채워넣을 예정



## 기타

- `ctrl + L` : 현재 프롬프트 창에 있는 내용 비움

- `shift + insert` : 붙여넣기