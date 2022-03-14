<template>
  <div>
    <div id="container">
      <img src="./assets/zhiHu_title.png" alt="logo"/>
      <Register/>
    </div>
  </div>
</template>

<script>
import Register from "@/components/RegisterForm";

export default {
  name: 'App',
  components: {
    Register,
  }
}
</script>

<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  background: #b8e5f8 url("./assets/sign_bg.png") repeat;
  background-size: cover;
  width: 100%;
  height: 100vh;
  overflow: auto;
}

body {
  margin: 0;
}

#container {
  width: min-content;
  margin: 0 auto;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

img {
  width: 128px;
  height: 81px;
  margin-bottom: 24px;
}

</style>
