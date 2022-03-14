<template>
  <div id="container">
    <header>
      <span>密码登录</span>
      <hr>
    </header>
    <div id="body">
      <div>
        <input placeholder="手机号" type="text" v-model="account">
        <hr>
        <input placeholder="密码" type="password" v-model="pwd">
        <hr>
        <a href="#">海外手机号登录</a>
        <a href="#">忘记密码？</a>
        <button type="submit" @click="postForm">注册/登录</button>
      </div>
      <p>未注册手机验证后自动登录，注册即代表同意《知乎协议》《隐私保护指引》</p>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "RegisterForm",
  data() {
    return {
      account: "",
      pwd: "",
    }
  },
  methods: {
    postForm() {
      console.log(this.account, this.pwd)
      const {account, pwd} = this;
      if (!(0 < account.length && account.length < 12))
        return alert("请输入合法数据：账号1~11位")
      if (!(0 < pwd.length && pwd.length < 7)) {
        return alert("请输入合法数据：密码1~6位！");
      }
      axios.get("http://localhost:8080/register", {
        params: {
          account,
          pwd,
        }
      })
          .then((res) => {
            console.log(res.data)
            const {flag, data, message} = res.data;
            if (flag)
              return alert(data);
            return alert(message);
          })
    }
  },
}

</script>

<style scoped lang="scss">
#container {
  width: 400px;
  background-color: #FFFF;

  header {
    width: 100%;
    height: 60px;
    margin: 0;
    padding-left: 20px;

    span {
      display: inline-block;
      margin-top: 20px;
      color: grey;
    }

    :first-child {
      margin-left: 20px;
    }

    :nth-child(2) {
      margin-left: 20px;
      color: black;
      font-size: large;
    }

    img {
      float: right;
      height: 100%;
    }

    hr {
      width: 64px;
      height: 3px;
      margin-left: 125px;
      background-color: blue;
    }
  }
}

#body {
  width: 90%;
  margin: 20px 0 0 20px;

  > div {
    height: 170px;

    input {
      border: none;
    }

    a, a:link, a:visited {
      text-decoration: none;
      font-size: small;
    }

    :nth-child(6) {
      display: inline-block;
      float: right;
      color: gray;
    }

    button {
      display: block;
      width: 100%;
      height: 25px;
      background-color: rgb(0, 102, 255);
      border: none;
      margin-top: 20px;
      color: #FFF;
    }
  }

  p {
    font-size: small;
    color: gray;
  }

}

#login {
  margin-top: 20px;

  :first-child {
    font-size: small;
    color: gray;
  }

  div {
    display: inline-block;
    margin-left: 35px;
  }
}

footer {
  height: 50px;
  background-color: rgb(246, 246, 246);
  padding: 0 20px;
  margin-top: 20px;
  display: flex;
  align-items: center;
  justify-content: space-between;

  span {
    text-align: center;
  }
}
</style>