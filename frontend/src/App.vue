<template>
  <div id="app">
    <Header/>
    <img src="./assets/home.jpg" />
    <Login/>
  </div>
</template>

<script>
import Header from './components/Header'
import Login from './components/Login'

export default {
  name: 'App',
  components: {
    Login,
    Header
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
