from pathlib import Path



IRRELEVANT_FOLDERS: list[str] = ["textos", ".mypy_cache", ".git"]
ROOT_PATH: Path = Path()



relevant_folders = filter(
    lambda folder: folder.is_dir() and folder.name not in IRRELEVANT_FOLDERS,
    ROOT_PATH.iterdir()
)



choices: dict[str, str] = {}



destination_folder: Path = ROOT_PATH / "textos"
destination_folder.mkdir(exist_ok=True)



print("\nEscolha qual pasta deseja transformar em .txt\n")

for index, folder in enumerate(relevant_folders, start=1):
    print(f"{index} - {folder.name:.<20}")
    choices[str(index)] = folder.name



selection = input("\nDigite sua escolha: ")


if not (chosen_folder_name := choices.get(selection)):
    raise Exception("Número inválido!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")

chosen_folder = ROOT_PATH / chosen_folder_name

def sort_file_list(file_list: list[Path]) -> list[Path]:
    """
    Ordena arquivos cujo nome (sem extensão) segue o padrão 'Exc<number>'.
    Retorna a lista ordenada pelo valor numérico.

    :param lista_arquivos: Lista de objetos Path a serem ordenados.
    """
    intermediate = sorted(
        [
            (int(path.stem.replace("Exc", "")), path)
            for path in file_list
        ]
    )
    return [item[1] for item in intermediate]


output_file = destination_folder / f"{chosen_folder.name}.txt"

with open(output_file, mode="w", encoding="utf-8") as output:

    for file_path in sort_file_list(list(chosen_folder.iterdir())):
        output.write(file_path.name)
        output.write(file_path.read_text())
        output.write("\n" * 5)
