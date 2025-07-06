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




output_file = destination_folder / f"{chosen_folder.name}.txt"

with open(output_file, mode="w", encoding="utf-8") as output:

    for file_path in chosen_folder.iterdir():
        output.write(file_path.name)
        output.write(file_path.read_text())
        output.write("\n" * 5)
