<template>
  <div id="app">
    <MyItem></MyItem>
  </div>
</template>

<script>

// 引入子组件

import MyItem from '@/components/MyItem.vue'

  export default {
    data(){
      return{

      }
    },
    components:{
       MyItem
    }
  }
</script>
<style lang="less">

</style>