# Github TIL

## 1. TIL?

> - TIL은 **T**oday **I** **L**earned의 줄임말로 개발자 사이에서 매일 자신이 학습한 내용을 commit(기록)하는 것
> - github, bitbucket, gitlab과 같은 원격 저장소에서 제공하는 1commit-1grass의 흥미 요소 제공

- Git : **버전**을 통해 **코드를 관리**하는 도구
- SCM(Source Code Management) : 코드 관리
  - 프로그래밍 (소스) 코드 ? 컴퓨터에게 명령(Java -> Computer)
- VCS(Version Control System) : 버전 관리



## 2. TIL 세팅

### (1) Git으로 프로젝트 관리 시작 : `git init`

- 자신이 앞으로 학습한 내용을 기록할 `TIL`폴더를 하나 생성한다. 이때 해당 폴더는 최상단에 생성한다.

- `git bash`에서 `TIL`폴더로 이동한 이후에 아래의 명령어로 `git`관리를 시작한다.

  ```shell
  $ git init
  ```

  - `git init` 후 변화
    1. `(master)`
    2. `.git`폴더가 생성
    3. `.git`폴더 삭제 시, git 관리 중지 ( git을 삭제 )



### (2) Commit을 위한 Staging : `git add`

- 현재 코드 상태의 스냅샷을 찍기 위한 파일 선택 ( = Staging Area에 파일 추가 )

  ```shell
  $ git add [파일 이름] # .은 모든 변경 사항을 Staging area로 올림
  ```



### (3) 버전 관리를 위한 스냅샷 저장 : `git commit`

- 현재 상태에 대한 스냅샷을 `commit`하여, 버전 관리를 진행한다.

  ```shell
  $ git commit -m "커밋 메세지"
  ```

  - 최초 `git commit` 시

    ```shell
    Author identity unknown
    # 작성자의 신원을 모르겟다.
    *** Please tell me who you are.
    # 니가 누군지 말해달라.
    Run
    # 아래의 명령어를 실행해달라.
    	git config --global user.email "you@example.com"
    	git config --global user.name "Your Name"
    to set your account's default identity.
    Omit --global to set the identity only in this repository.
    
    fatal: unable to auto-detect email address (got 'student@M301INS.(none)')
    ```

    

### (4) 원격 저장소 정보 추가 : `git remote`

- Github 원격(remote) 저장소(repository)를 생성하고 `TIL` 폴더와 연결한다.

- 새로운 원격 저장소가 추가될 때만 입력한다.

  ```shell
  $ git remote add origin [github 원격 저장소 주소]
  ```



### (5) 원격 저장소로 코드 `git push`

- 최종적으로 Github 원격 저장소에 push 한다.

  ```shell
  $ git push origin master
  ```



### (6) 그 외 명령어

- 현재 `git`의 상태를 조회 `git status`

  ```shell
  $ git status
  ```

  - 최초 상태 (파일 없음)

    ```shell
    On branch master
    
    No commits yet # 아직 버전이 없다.
    
    nothing to commit (create/copy files and use "git add" to track) # 할 게 없다
    ```

  

  - 파일 생성 (touch a.txt)

    ```shell
    On branch master
    
    No commits yet
    
    Untracked files:
    (use "git add <file>..." to include in what will be committed)
    	  a.txt
    # 추척되지 않는 파일 (git add <특정파일>을 해줘, 버전(스냅샷)에 포함시키고 싶으면)
    
    nothing added to commit but untracked files present (use "git add" to track)
    # 아직 commit할 수 없다. 추적되지 않는 파일은 있다. (add 해라)
    ```

    

  - `git add a.txt`명령어 실행 후

    ```shell
    On branch master
    
    No commits yet
    
    Changes to be committed:
    	(use "git rm --cached <file>..." to unstage)
    			new file: a.txt
    # 버전으로 commit할 변화가 있다. (== commit 할 수 있다.)
    ```

  

  - `git commit` 실행 후

    ```shell
    On branch master
    
    nothing to commit, working tree clean
    # 할 게 없다.
    ```

    

  - `a.txt`에 내용 추가 ("hi")

    ```shell
    Changes not staged for commit:
    	(use "git add <file>..." to update what will be committed)
    	(use "git restore <file>..." to discard changes in working directory)
    		modified: a.txt
    no changes added to commit (use "git add" and/or "git commit -a")
    ```



- 버전 관리 이력을 조회

  ```shell
  $ git log
  ```

  - `git log --oneline` : 한줄로 출력

- commit 된 버전과 현재 상태 차이 출력

  ```shell
  $ git diff [파일명]
  ```

  

- `git`설정 (user.name & user.email) : **최초 1회 설정**

  ```shell
  $ git config --global user.name "SEONHA SHIM"
  $ git config --global user.email "ssunh0316@khu.ac.kr"
  ```



## 3. `README.md`

>원격(remote) 저장소(repository)에 대한 정보를 기록하는 마크다운 문서. 일반적으로 해당 프로젝트를 사용하기 위한 방법 등을 기재한다.



### (1) `README.md` 파일 생성

- `README.md`파일을 `TIL`폴더(최상단)에 생성한다. 이름은 반드시 **README.md**로 설정한다.

  ```shell
  $ touch README.md
  ```



### (2) (자신만의) TIL 원칙에 대한 간단한 내용 추가

- 마크다운 작성법 pdf에서 배우고 실습한 내용을 토대로 `README.md`파일을 작성한다.
- 형식은 자유롭게 작성하되 마크다운 문법(의미론적)을 지켜서 작성한다.



### (3) 저장 후 버전관리 : `add`, `commit`, `push`

- 작성이 완료되면 아래의 명령어를 통해 commit 이력을 남기고 원격 저장소로 push한다.

  ```shell
  $ git add README.md
  $ git commit -m "add README.md"
  $ git push origin master
  ```



## 4. 추가 학습 내용 관리

### (1) 추가 내용 관리

- `TIL`폴더 내에서 학습을 원하는 내용의 폴더를 생성하고 파일들을 생성한 후 작업을 진행한다.

  ```shell
  $ mkdir python
  ```



### (2) 변경 사항을 저장하고, 원격저장소로 옮긴다.

- 업데이트가 완료되면 아래의 명령어를 통해 commit 이력을 남기고 원격 저장소로 push한다.

  ```shell
  $ git add .
  $ git commit -m "학습 내용 추가"
  $ git push origin master
  ```



