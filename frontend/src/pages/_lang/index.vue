<template>
    <div class="Content">
        <h1 class="Content__Title">{{ $t('home.title') }}</h1>
        <p>{{ $t('home.introduction') }}</p>
        <p>{{ hello }}</p>
    </div>
</template>

<script>
    import axios from 'axios'

    export default {
        head () {
            return {
                title: this.$t('home.title'),
            }
        },
        asyncData () {
            return axios.get('http://localhost:8080/hello')
                .then((res) => {
                    return {hello: res.data}
                })
//                .catch(() => {
//                    error({ message: 'Hello not found', statusCode: 404 })
//                })
        }
    }
</script>
