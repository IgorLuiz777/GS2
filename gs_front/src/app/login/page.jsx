
import Link from 'next/link'
import './login.scss'

export default function Login() {

    return(
        <main>
            <div className="content_login">
                <div className='div_img'>
                    <img src="cadastro(1).png" alt="" />
                </div>
                <div className='form'>
                    <h3>Login</h3>
                    <form action="">

                        <label htmlFor="email">Email</label>
                        <input type="email" name="email" id="email" placeholder='Digite o seu email' required/>

                        <label htmlFor="password">Senha</label>
                        <input type="password" name="password" id="password" placeholder='Digite a sua senha' required/>

                        <button>Entrar</button>

                        <p>Não tem um cadastro? <Link href={'/cadastro'}>Cadastre-se</Link></p>

                    </form>
                </div>           
            </div>
        </main>
    )
}