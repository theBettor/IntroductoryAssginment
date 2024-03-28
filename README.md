> 순서 : SignIn -> SignUp or Home<br>

> 레이아웃은 학습의 측면으로 시도한 부분 참고 바랍니다. 제일 많이 사용될 것 같은 방식 3가지로 만들어보았습니다.
<br>

## 1. SignIn<br>

### 1) Activity<br>
1. 전역변수를 도입했다. 구동하는데는 문제가 없지만 익숙해져야할 개념이다.
2. putExtra로 한가지의 데이터만 보내고 있는데 2개로 보내고 싶네...

### 2) layout : ConstraintLayout<br>
1.로고 이미지와 버튼들은 반드시 center로 위치하게 만들었다.<br>
2. 밑에 텍스트뷰들과 edittext들은 starttostartof를 이용하여 로고 이미지를 기준으로 하여 왼쪽 라인(?)을 정리함으로써 통일감울 주었다. starttostart는 레이아웃이 자동으로 맞춰지는게 아니라 제한범위를 정해준다는 뜻 같다. 제약을 주면 더 왼쪽으로 갈 수 없게 막혀있다.<br>
3. 아이디 TextView 부분 marginEnd와 Right가 296으로 되어있어야만 starttostartof가 정상적으로 작동되는 문제가 있었다. 분명 아래 비밀번호 TextView와 통일감을 주고 싶은데 그러지 못해서 확인해보니 app:layout_constraintHorizontal_bias="0.0" 를 사용하고 있어서 대체했다.<br>

## 2. SignUp<br>

### 1) Activity<br>
1. 여기서 입력 받은 데이터를 SignIn으로 보내는 putExtra를 쓰고 있는데 나중에 참조해서 고쳐보자.

### 2) layout : LinearLayout<br>
1. textview에도 gravity가 있었는데 생각해보니 edittext처럼 입력값을 받는것을 볼 수 있는 객체가 아니니까 빼버렸다.<br>
2. 5개의 레이아웃 간에 간격을 만들기 위해 marginbottom을 사용했다.<br>
3. 제일 상위 개념의 리니어에 꼭 android:gravity="center" 해줘야 가운데 정렬이 된다.<br>
4. weightSum으로 뷰와 레이아웃간의 비율 조절을 할 수 있다.<br>
5. layout_height는 무조건 0dp 여야 하나?<br>
6. 5개의 리니어레이아웃에는 모두 weight이 적용되어 있고, 그 하위 위젯들은 따로 weight을 지정하고 있지 않은데, 유일하게 버튼 위젯만 weight을 최소 1은 지정해놔야 정상적으로 표시된다. 각 리니어 안에 들어있는 위젯들 중 단일 위젯을 갖고 있는 리니어들은 로고쪽과 버튼쪽 리니어인데 로고쪽은 위젯이 weight을 갖고 있지 않아도 정상적으로 표현된다.<br>

## 3. Home<br>

### 1) Activity<br>
-

### 2) layout : RelativeLayout<br>
1. android:layout_alignParentTop="true" : true이면 부모 창의 위쪽 선에 View의 위쪽 선을 맞춤.<br>
2. android:layout_centerInParent="true" : 가운데 정렬하기.<br>
3. 여기는 margintop으로 간격을 두었다.
4. android:layout_below="@id/homeLogoView" : 로고뷰 밑으로 배치하겠다는 뜻.
5. RelativeLayout이 제일 보기 편하고 좋네


# 나중에 수정하면 좋겠는 것들
1. 랜덤 이미지 크기가 고정되면 좋겠따...<br>
2. putExtra 둘 이상의 데이터도 보낼 수 있을까?<br>
3. SignUp 화면에서는 데이터를 입력할때 키보드에서 -> 버튼을 통해 바로 다음 edittext로 넘어갈 수 있게 되던데 SignIn에서는 그게 안된다 시도는 안해봤는데 어떻게 할 수 있는거지?<br>


