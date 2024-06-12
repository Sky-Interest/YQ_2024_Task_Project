<template>
  <div id="app">
    <h1>我是app主组件</h1>

    <a href="#/home">home</a>|
    <a href="#/movie">movie</a>|
    <a href="#/about">about</a>

    <!-- 添加占位符 -->
    <router-view></router-view>

  </div>
</template>

<script>

export default {

}
</script>

<style lang="less">
</style>
