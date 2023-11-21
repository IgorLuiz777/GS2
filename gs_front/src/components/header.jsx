import Link from "next/link";
import './components.scss'

export default function header() {

    return(
        <div className="content_header">
            <header>
                <nav>
                    <ul>
                        <li><p>TechCare <span>4 All</span></p></li>
                        <div className="nav_links">
                            <li><Link href={'/'}>Home</Link></li>
                            <li><Link href={'/servicos'}>Serviços</Link></li>
                            <li><Link href={'/contato'}>Contatate-nos</Link></li>
                        </div>
                        <li><Link href={'/login'} className={"login"}>Login</Link> <Link href={'/cadastro'} className={"cadastro"}>Cadastro</Link></li>                   
                    </ul>
                </nav>
            </header>
        </div>
    )
}