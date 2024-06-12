import Vue from 'vue'
import App from './App.vue'

// 导入路由模块  目的： 是拿到路由的实例对象

import router from '@/router/index.js'

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  router: router// 挂载router路由实例对象
}).$mount('#app')
